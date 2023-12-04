<<<<<<<< HEAD:pet-clinic-data/src/main/java/com/mezo/petclinic/model/Pet.java
package com.mezo.petclinic.model;
========
package com.mezo.model.petclinic;
>>>>>>>> 2454413a5c3f4f3fc6b7dd91f4f5d240634f5981:pet-clinic-data/src/main/java/com/mezo/model/petclinic/Pet.java

import java.time.LocalDate;

public class Pet {
    private LocalDate birthDate;
    private PetType type;
    private Owner owner;

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public PetType getType() {
        return type;
    }

    public void setType(PetType type) {
        this.type = type;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
