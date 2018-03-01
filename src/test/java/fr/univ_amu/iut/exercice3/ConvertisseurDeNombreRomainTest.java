package fr.univ_amu.iut.exercice3;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConvertisseurDeNombreRomainTest {

    private ConvertisseurDeNombreRomain convertisseurDeNombreRomain;

    @Before
    public void setUp() {
        convertisseurDeNombreRomain = new ConvertisseurDeNombreRomain();
    }

    @Ignore
    @Test
    public void leChiffreRomainIDevraitDonner1() {
        int nombre = convertisseurDeNombreRomain.enNombreArabe("I");
        assertThat(nombre).isEqualTo(1);
    }

    @Ignore
    @Test
    public void leChiffreRomainVDevraitDonner5() {
        int nombre = convertisseurDeNombreRomain.enNombreArabe("V");
        assertThat(nombre).isEqualTo(5);
    }

    @Ignore
    @Test
    public void leChiffreRomainXDevraitDonner10() {
        int nombre = convertisseurDeNombreRomain.enNombreArabe("X");
        assertThat(nombre).isEqualTo(10);
    }

    @Ignore
    @Test
    public void leChiffreRomainIIDevraitDonner2() {
        int nombre = convertisseurDeNombreRomain.enNombreArabe("II");
        assertThat(nombre).isEqualTo(2);
    }

    @Ignore
    @Test
    public void leChiffreRomainIIIDevraitDonner3() {
        int nombre = convertisseurDeNombreRomain.enNombreArabe("III");
        assertThat(nombre).isEqualTo(3);
    }

    @Ignore
    @Test
    public void leChiffreRomainVIDevraitDonner6() {
        int nombre = convertisseurDeNombreRomain.enNombreArabe("VI");
        assertThat(nombre).isEqualTo(6);
    }

    @Ignore
    @Test
    public void leChiffreRomainIVDevraitDonner4() {
        int nombre = convertisseurDeNombreRomain.enNombreArabe("IV");
        assertThat(nombre).isEqualTo(4);
    }

    @Ignore
    @Test
    public void leChiffreRomainIXDevraitDonner9() {
        int nombre = convertisseurDeNombreRomain.enNombreArabe("IX");
        assertThat(nombre).isEqualTo(9);
    }

    @Ignore
    @Test
    public void leChiffreRomainXLIXDevraitDonner49() {
        int nombre = convertisseurDeNombreRomain.enNombreArabe("XLIX");
        assertThat(nombre).isEqualTo(49);
    }

    @Ignore
    @Test
    public void leChiffreRomainXCIXDevraitDonner99() {
        int nombre = convertisseurDeNombreRomain.enNombreArabe("XCIX");
        assertThat(nombre).isEqualTo(99);
    }

    @Ignore
    @Test
    public void leChiffreRomainCCCXLVIDevraitDonner346() {
        int nombre = convertisseurDeNombreRomain.enNombreArabe("CCCXLVI");
        assertThat(nombre).isEqualTo(346);
    }

    @Ignore
    @Test
    public void leChiffreRomainCCCXCIXDevraitDonner399() {
        int nombre = convertisseurDeNombreRomain.enNombreArabe("CCCXCIX");
        assertThat(nombre).isEqualTo(399);
    }

    @Ignore
    @Test
    public void leChiffreRomainMMMMDCCCLXXXVIIIDevraitDonner4888() {
        int nombre = convertisseurDeNombreRomain.enNombreArabe("MMMMDCCCLXXXVIII");
        assertThat(nombre).isEqualTo(4888);
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void leChiffreRomainICDevraitDonnerUneException() {
        convertisseurDeNombreRomain.enNombreArabe("IC");
        convertisseurDeNombreRomain.enNombreArabe("ID");
        convertisseurDeNombreRomain.enNombreArabe("IM");
        convertisseurDeNombreRomain.enNombreArabe("XD");
        convertisseurDeNombreRomain.enNombreArabe("XM");
    }
}