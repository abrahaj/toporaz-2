package de.toporaz

class Document {
    String name
    String type
    Person quoted
    static belongsTo = Person
    static hasMany = [authors:Person,quotes:Person]

    /*Material:

    Publishing
    Published:
    Publishing Place:
    Move


    Location:

    Shelfmark:
    Scale:
    Measurements:
    Volume:
    Place of Storage:
    Digital Copy:
    */

    static mappedBy = [ quotes: "none", authors: "none" ]

    static constraints = { quotes nullable: true }
}
