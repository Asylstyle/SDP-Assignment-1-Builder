package wedding;

public class Main {

    public static void main(String[] args) {

        WeddingInvitationDirector director =
                new WeddingInvitationDirector();

        WeddingInvitation digitalInvitation =
                director.createElegantInvitation(
                        new DigitalWeddingInvitationBuilder()
                );

        WeddingInvitation printedInvitation =
                director.createSimpleInvitation(
                        new PrintedWeddingInvitationBuilder()
                );

        System.out.println("DIGITAL INVITATION");
        System.out.println(digitalInvitation);

        System.out.println();

        System.out.println("PRINTED INVITATION");
        System.out.println(printedInvitation);
    }
}