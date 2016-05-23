package de.toporaz

class FurnishingChangeLocation {

    String name
    Building transferredFrom
    Building transferredTo
    ToporazDate date
    Document locationReference

    static mappedBy = [ transferredFrom: "none", transferredTo: "none" ]
    static constraints = {
        name nullable: false
    }
}
