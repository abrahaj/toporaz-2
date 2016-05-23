package de.toporaz

class Furnishing {
    String name
    String type
    String category

    /** Production info **/
    static hasMany = [donor:Person,producer:Person, measurement:Measurement, furnishingChangeLocation:FurnishingChangeLocation]
    Date productionDate
    String material
    String technique
    String Location
    Document reference
    /** End Production **/

    String conservationStatus
    String conditionState
    Person conservationStatusAssessedBy
    ToporazDate conservationStatusDate
    Document conservationStatusReference

    static mappedBy = [ donor: "none", producer: "none" ]


    static constraints = {
    }
}
