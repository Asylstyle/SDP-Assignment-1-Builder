package wedding;

public abstract class WeddingInvitationBuilder {

    protected String brideName;
    protected String groomName;
    protected String date;
    protected String time;
    protected String venue;
    protected String dressCode;
    protected String rsvp;

    public WeddingInvitationBuilder setBrideName(String brideName) {
        this.brideName = brideName;
        return this;
    }

    public WeddingInvitationBuilder setGroomName(String groomName) {
        this.groomName = groomName;
        return this;
    }

    public WeddingInvitationBuilder setDate(String date) {
        this.date = date;
        return this;
    }

    public WeddingInvitationBuilder setTime(String time) {
        this.time = time;
        return this;
    }

    public WeddingInvitationBuilder setVenue(String venue) {
        this.venue = venue;
        return this;
    }

    public WeddingInvitationBuilder setDressCode(String dressCode) {
        this.dressCode = dressCode;
        return this;
    }

    public WeddingInvitationBuilder setRsvp(String rsvp) {
        this.rsvp = rsvp;
        return this;
    }

    public WeddingInvitation build() {
        validateRequiredFields();

        String finalDressCode =
                isEmpty(dressCode) ? getDefaultDressCode() : dressCode;

        String finalRsvp =
                isEmpty(rsvp) ? getDefaultRsvp() : rsvp;

        return new WeddingInvitation(
                brideName,
                groomName,
                date,
                time,
                venue,
                finalDressCode,
                finalRsvp,
                getFormat(),
                getDeliveryDetails()
        );
    }

    private void validateRequiredFields() {
        if (isEmpty(brideName)) {
            throw new IllegalStateException("Bride name is required.");
        }

        if (isEmpty(groomName)) {
            throw new IllegalStateException("Groom name is required.");
        }

        if (isEmpty(date)) {
            throw new IllegalStateException("Wedding date is required.");
        }

        if (isEmpty(time)) {
            throw new IllegalStateException("Wedding time is required.");
        }

        if (isEmpty(venue)) {
            throw new IllegalStateException("Wedding venue is required.");
        }
    }

    private boolean isEmpty(String value) {
        return value == null || value.isBlank();
    }

    protected abstract InvitationFormat getFormat();

    protected abstract String getDefaultDressCode();

    protected abstract String getDefaultRsvp();

    protected abstract String getDeliveryDetails();
}