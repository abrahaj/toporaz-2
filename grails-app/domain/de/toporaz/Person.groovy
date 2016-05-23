package de.toporaz

class Person {
    String name
    //TODO HAS MORE THAN ONE ALTERNATIVE NAME
    String AlternativeName

    Profession profession
    /*

    Marriage
    MarriedTo:
    Reference:

    Person Relation
    Relation Type:
    Person:

    Donated / Commisioned
    Donor/Commisioner:
    Reference:

    Depictions/Portraits :

    Resident
    Occupant:
    Change of Residence
    Residence Start Date:
    Residence Leaving Date:
    Reference:


    Social Group:

    Administrative Function
    Official Function:
    Office:
    Office Start:
    Office End:
    Reference:

    Birth
    Date of Birth:
    Place of birth:
    Reference:
    Death
    Date of death:
    Place of death:
    Buried:
    Reference:

    Owner
    Ownership:
    Received From:
    Reference Start:
    Reference:
    Reference End:
    static belongsTo = [ supervisor: Person ]

    static mappedBy = [ supervisor: "none", parent: "none" ]

    static constraints = { supervisor nullable: true }
*/
    static constraints = {name nullable: false}
}
