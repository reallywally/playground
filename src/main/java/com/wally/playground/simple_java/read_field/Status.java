package com.wally.playground.simple_java.read_field;

import lombok.Getter;

@Getter
public enum Status {
    ACTIVE("활성", "111"),
    PAUSED("비활성", "222"),
    REMOVED("삭제", "333");

    private final String label;
    private final String testField;

    Status(String label, String testField) {
        this.label = label;
        this.testField = testField;
    }
}
