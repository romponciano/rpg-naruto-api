package ponciano.rom.domain.model;

public class Skills {
    private Integer ninjutsu;
    private Integer igakujutsu;
    private Integer genjutsu;
    private Integer bukijutsu;
    private Integer taijutsu;
    private Integer fuinjutsu;
    private Integer ichizoku;
    private Integer senjutsu;

    public Skills(Integer ninjutsu, Integer igakujutsu, Integer genjutsu, Integer bukijutsu, Integer taijutsu, Integer fuinjutsu, Integer ichizoku, Integer senjutsu) {
        setNinjutsu(ninjutsu);
        setIgakujutsu(igakujutsu);
        setGenjutsu(genjutsu);
        setBukijutsu(bukijutsu);
        setTaijutsu(taijutsu);
        setFuinjutsu(fuinjutsu);
        setIchizoku(ichizoku);
        setSenjutsu(senjutsu);
    }

    public Skills() {
        setNinjutsu(null);
        setIgakujutsu(null);
        setGenjutsu(null);
        setBukijutsu(null);
        setTaijutsu(null);
        setFuinjutsu(null);
        setIchizoku(null);
        setSenjutsu(null);
    }

    public Integer getNinjutsu() {
        return ninjutsu;
    }

    public void setNinjutsu(Integer ninjutsu) {
        this.ninjutsu = ninjutsu == null ? 0 : ninjutsu;
    }

    public Integer getIgakujutsu() {
        return igakujutsu;
    }

    public void setIgakujutsu(Integer igakujutsu) {
        this.igakujutsu = igakujutsu == null ? 0 : igakujutsu;
    }

    public Integer getGenjutsu() {
        return genjutsu;
    }

    public void setGenjutsu(Integer genjutsu) {
        this.genjutsu = genjutsu == null ? 0 : genjutsu;
    }

    public Integer getBukijutsu() {
        return bukijutsu;
    }

    public void setBukijutsu(Integer bukijutsu) {
        this.bukijutsu = bukijutsu == null ? 0 : bukijutsu;
    }

    public Integer getTaijutsu() {
        return taijutsu;
    }

    public void setTaijutsu(Integer taijutsu) {
        this.taijutsu = taijutsu == null ? 0 : taijutsu;
    }

    public Integer getFuinjutsu() {
        return fuinjutsu;
    }

    public void setFuinjutsu(Integer fuinjutsu) {
        this.fuinjutsu = fuinjutsu == null ? 0 : fuinjutsu;
    }

    public Integer getIchizoku() {
        return ichizoku;
    }

    public void setIchizoku(Integer ichizoku) {
        this.ichizoku = ichizoku == null ? 0 : ichizoku;
    }

    public Integer getSenjutsu() {
        return senjutsu;
    }

    public void setSenjutsu(Integer senjutsu) {
        this.senjutsu = senjutsu == null ? 0 : senjutsu;
    }
}
