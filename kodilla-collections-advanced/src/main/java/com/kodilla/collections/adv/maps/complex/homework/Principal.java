package com.kodilla.collections.adv.maps.complex.homework;

import java.util.Objects;

public class Principal {

    private String principalName;
    private String principalSecondName;

    public Principal(String principalName, String principalSecondName) {
        this.principalName = principalName;
        this.principalSecondName = principalSecondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(principalName, principal.principalName) &&
                Objects.equals(principalSecondName, principal.principalSecondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(principalName, principalSecondName);
    }

    public String getPrincipalName() {
        return principalName;
    }

    public String getPrincipalSecondName() {
        return principalSecondName;
    }
}
