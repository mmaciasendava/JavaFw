package org.personal.model;
import lombok.Builder;

@Builder
public class User {

    private Long id;
    private String name;
    private String lastName;
    private String phoneNumber;
}
