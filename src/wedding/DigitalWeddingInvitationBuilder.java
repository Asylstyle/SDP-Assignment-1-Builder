package wedding;

public class DigitalWeddingInvitationBuilder
        extends WeddingInvitationBuilder {

    private static final String DEFAULT_DRESS_CODE = "Smart casual";
    private static final String DEFAULT_RSVP = "Confirm online";
    private static final String DELIVERY_DETAILS =
            "Digital link and QR code";

    @Override
    protected InvitationFormat getFormat() {
        return InvitationFormat.DIGITAL;
    }

    @Override
    protected String getDefaultDressCode() {
        return DEFAULT_DRESS_CODE;
    }

    @Override
    protected String getDefaultRsvp() {
        return DEFAULT_RSVP;
    }

    @Override
    protected String getDeliveryDetails() {
        return DELIVERY_DETAILS;
    }
}