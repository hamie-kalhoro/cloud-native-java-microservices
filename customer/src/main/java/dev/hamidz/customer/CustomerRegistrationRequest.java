package dev.hamidz.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email ) {
}
