package wedding;

public class WeddingInvitation {

    private final String brideName;
    private final String groomName;
    private final String date;
    private final String time;
    private final String venue;
    private final String dressCode;
    private final String rsvp;
    private final InvitationFormat format;
    private final String deliveryDetails;

    public WeddingInvitation(
            String brideName,
            String groomName,
            String date,
            String time,
            String venue,
            String dressCode,
            String rsvp,
            InvitationFormat format,
            String deliveryDetails) {

        this.brideName = brideName;
        this.groomName = groomName;
        this.date = date;
        this.time = time;
        this.venue = venue;
        this.dressCode = dressCode;
        this.rsvp = rsvp;
        this.format = format;
        this.deliveryDetails = deliveryDetails;
    }

    @Override
    public String toString() {
        return """
                ==============================
                    WEDDING INVITATION
                ==============================
                Bride: %s
                Groom: %s
                Date: %s
                Time: %s
                Venue: %s
                Dress code: %s
                RSVP: %s
                Format: %s
                Delivery: %s
                ==============================
                """.formatted(
                brideName,
                groomName,
                date,
                time,
                venue,
                dressCode,
                rsvp,
                format,
                deliveryDetails
        );
    }
}