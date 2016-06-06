package de.toporaz

class Marriage {
    Person partner1
    Person partner2
    Document document
    ToporazDate date
    static mappedBy = [ partner1: "none", partner2: "none" ]

    static constraints = {
    }
}
