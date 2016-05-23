package de.toporaz

class User {

    String login
    String password
    String email



    static constraints = {
        login size: 3..15, blank: false, unique: true
        password size: 5..15, blank: false
        email email: true, blank: false
    }
}
