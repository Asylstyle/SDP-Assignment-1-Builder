package wedding;

public class PrintedWeddingInvitationBuilder
        extends WeddingInvitationBuilder {

    private static final String DEFAULT_DRESS_CODE = "Formal";
    private static final String DEFAULT_RSVP = "Confirm by phone";
    private static final String DELIVERY_DETAILS =
            "Printed premium invitation card";

    @Override
    protected InvitationFormat getFormat() {
        return InvitationFormat.PRINTED;
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