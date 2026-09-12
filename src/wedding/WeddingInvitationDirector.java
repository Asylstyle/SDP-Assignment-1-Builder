package wedding;

public class WeddingInvitationDirector {

    public WeddingInvitation createElegantInvitation(
            WeddingInvitationBuilder builder) {

        return builder
                .setBrideName("Anna")
                .setGroomName("Daniel")
                .setDate("20 September 2026")
                .setTime("18:00")
                .setVenue("Grand Ballroom, Astana")
                .setDressCode("Formal")
                .setRsvp("Confirm before 10 September")
                .build();
    }

    public WeddingInvitation createSimpleInvitation(
            WeddingInvitationBuilder builder) {

        return builder
                .setBrideName("Anna")
                .setGroomName("Daniel")
                .setDate("20 September 2026")
                .setTime("18:00")
                .setVenue("Astana")
                .build();
    }
}