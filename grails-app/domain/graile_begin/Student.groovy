package graile_begin

class Student {


    String name
    String email
    String password
    Date lastUpdated
    Date dateCreated

    static constraints =
            {
                name(unique: true)
            }

}
