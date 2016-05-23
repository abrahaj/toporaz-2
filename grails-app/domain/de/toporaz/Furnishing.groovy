package de.toporaz

class Furnishing {
    String name
    String type
    String category

    /** Production info **/
    static hasMany = [donor:Person,producer:Person, measurement:Measurement, furnishingChangeLocation:FurnishingChangeLocation]
    ToporazDate productionDate
    String material
    String technique
    String location
    Document reference
    /** End Production **/

    String conservationStatus
    String conditionState
    Person conservationStatusAssessedBy
    ToporazDate conservationStatusDate
    Document conservationStatusReference

    static mappedBy = [ donor: "none", producer: "none" ]


    static constraints = {
        name blank: false, nullable: false
        type blank: true, nullable: true
        category blank: false, nullable: false

        productionDate nullable: true
        material nullable: true
        technique  nullable: true
        location  nullable: true
        reference nullable: true

        conservationStatus nullable: true
        conditionState nullable: true
        conservationStatusAssessedBy  nullable: true
        conservationStatusDate nullable: true
        conservationStatusReference nullable: true
    }
}
