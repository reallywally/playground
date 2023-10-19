package com.wally.playground.spring.hexagonal_my.book.domain.model;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum BookCategory {
    SCIENCE_FICTION("Science Fiction"),
    FANTASY("Fantasy"),
    HORROR("Horror"),
    ROMANCE("Romance"),
    THRILLER("Thriller"),
    MYSTERY("Mystery"),
    WESTERN("Western"),
    DYSTOPIAN("Dystopian"),
    CONTEMPORARY("Contemporary"),
    MEMOIR("Memoir"),
    COOKING("Cooking"),
    ART("Art"),
    PERSONAL_GROWTH("Personal Growth"),
    HEALTH("Health"),
    HISTORY("History"),
    TRAVEL("Travel"),
    GUIDE_HOW_TO("Guide / How-to"),
    FAMILIES_RELATIONSHIPS("Families & Relationships"),
    HUMOR("Humor"),
    CHILDREN("Children"),
    OTHER("Other");

    private final String name;

    public String getName() {
        return name;
    }
}
