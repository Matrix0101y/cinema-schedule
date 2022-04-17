package com.company.cinemaschedule.enums;

public enum MessageCase {
    EMPLOYEE_CREATED("Employee successfully created"),
    EMPLOYEE_UPDATED("Employee successfully updated"),
    EMPLOYEE_DELETED("Employee successfully deleted");

    private String message;

    MessageCase(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
