# Wedding Invitation Builder

This project demonstrates the Builder creational design pattern in Java.

## Project Idea

The product of this project is a wedding invitation.

A wedding invitation contains several properties:

- bride name
- groom name
- wedding date
- time
- venue
- dress code
- RSVP information
- invitation format
- delivery details

The Builder pattern is useful because a wedding invitation can be constructed step by step and can have different representations.

## Builder Pattern Components

### Product
`WeddingInvitation`

Represents the final wedding invitation object.

### Builder
`WeddingInvitationBuilder`

Defines the common steps required to construct a wedding invitation.

### Concrete Builders

`DigitalWeddingInvitationBuilder`

Creates a digital invitation with online RSVP and digital delivery.

`PrintedWeddingInvitationBuilder`

Creates a printed invitation with phone RSVP and physical delivery.

### Director
`WeddingInvitationDirector`

Defines reusable construction sequences for wedding invitations.

### Client
`Main`

Demonstrates how the builders and director are used.

## Representations

### Digital Invitation

- Digital format
- Online RSVP
- Digital link and QR code

### Printed Invitation

- Printed format
- Phone RSVP
- Printed premium invitation card

## Technologies

- Java
- JDK 17
- Visual Studio Code
- Git
- GitHub

## How to Compile

```bash
javac -d out src/wedding/*.java