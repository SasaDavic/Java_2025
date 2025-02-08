package d06_09_2022_zadatak2;

enum Okrug {
	
	 // Okrug, Pokrajina (ako je potrebna dodatna informacija)
    BEOGRAD("Beograd", "Uza Srbija"),
    ZAJECARSKI_O("Zaječarski okrug", "Uza Srbija"),
    KOLUBARSKI_O("Kolubarski okrug", "Uza Srbija"),
    PODUNAVSKI_O("Podunavski okrug", "Uza Srbija"),
    BRANICEVSKI_O("Braničevski okrug", "Uza Srbija"),
    SUMADIJSKI_O("Šumadijski okrug", "Uza Srbija"),
    POMORAVSKI_O("Pomoravski okrug", "Uza Srbija"),
    BORSKI_O("Borski okrug", "Uza Srbija"),
    MACVANSKI_O("Mačvanski okrug", "Uza Srbija"),
    ZLATIBORSKI_O("Zlatiborski okrug", "Uza Srbija"),
    MORAVICKI_O("Moravički okrug", "Uza Srbija"),
    RASKI_O("Raški okrug", "Uza Srbija"),
    RASINSKI_O("Rasinski okrug", "Uza Srbija"),
    NISAVSKI_O("Nišavski okrug", "Uza Srbija"),
    TOPLICKI_O("Toplički okrug", "Uza Srbija"),
    PIROTSKI_O("Pirotski okrug", "Uza Srbija"),
    JABLANICKI_O("Jablanički okrug", "Uza Srbija"),
    PCINJSKI_O("Pčinjski okrug", "Uza Srbija"),
    SEVERNOBACKI_O("Severnobački okrug", "Vojvodina"),
    SREDNJOBANATSKI_O("Srednjobanatski okrug", "Vojvodina"),
    SEVERNOBANATSKI_O("Severnobanatski okrug", "Vojvodina"),
    JUZNOBANATSKI_O("Južnobanatski okrug", "Vojvodina"),
    ZAPADNOBACKI_O("Zapadnobački okrug", "Vojvodina"),
    JUZNOBACKI_O("Južnobački okrug", "Vojvodina"),
    SREMSKI_O("Sremski okrug", "Vojvodina"),
    KOSOVSKI_O("Kosovski okrug", "Kosovo i Metohija"),
    PECKI_O("Pećki okrug", "Kosovo i Metohija"),
    PRIZRENSKI_O("Prizrenski okrug", "Kosovo i Metohija"),
    KOSOVSKOMITROVACKI_O("Kosovskomitrovački okrug", "Kosovo i Metohija"),
    KOSOVSKOMORAVSKI_O("Kosovskopomoravski okrug", "Kosovo i Metohija");

    private final String naziv;
    private final String pokrajina;

    Okrug(String naziv, String pokrajina) {
        this.naziv = naziv;
        this.pokrajina = pokrajina;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getPokrajina() {
        return pokrajina;
    }
}
