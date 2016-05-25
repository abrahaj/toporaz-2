package de.toporaz

class BuildingPartPhase {
    String name
    String note
    ToporazDate constructionStart
    ToporazDate constructionEnd
    ToporazDate demolitionConversionDate
    static hasMany = [reference: Document]


    static mappedBy = [constructionStart: "none", constructionEnd: "none", demolitionConversionDate: "none"]
    static constraints = {
        name nullable: false
        note blank: true, nullable: true, type: 'text'
        constructionStart nullable: true
        constructionEnd nullable: true
        demolitionConversionDate nullable: true
        reference nullable:true
    }
}
