package dauanebackendsatc.projintermediariobackendsatc.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ModelPlayer {
    @JsonProperty("idPlayer")
    private String idPlayer;

    @JsonProperty("strPlayer")
    private String strPlayer;

    @JsonProperty("strPosition")
    private String strPosition;

    @JsonProperty("strNationality")
    private String strNationality;

    @JsonProperty("strHeight")
    private String strHeight;

    @JsonProperty("strWeight")
    private String strWeight;

    public String getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(String idPlayer) {
        this.idPlayer = idPlayer;
    }

    public String getStrPlayer() {
        return strPlayer;
    }

    public void setStrPlayer(String strPlayer) {
        this.strPlayer = strPlayer;
    }

    public String getStrPosition() {
        return strPosition;
    }

    public void setStrPosition(String strPosition) {
        this.strPosition = strPosition;
    }

    public String getStrNationality() {
        return strNationality;
    }

    public void setStrNationality(String strNationality) {
        this.strNationality = strNationality;
    }

    public String getStrHeight() {
        return strHeight;
    }

    public void setStrHeight(String strHeight) {
        this.strHeight = strHeight;
    }

    public String getStrWeight() {
        return strWeight;
    }

    public void setStrWeight(String strWeight) {
        this.strWeight = strWeight;
    }

    @Override
    public String toString() {
        return "ModelPlayer{" +
                "idPlayer='" + idPlayer + '\'' +
                ", strPlayer='" + strPlayer + '\'' +
                ", strPosition='" + strPosition + '\'' +
                ", strNationality='" + strNationality + '\'' +
                ", strHeight='" + strHeight + '\'' +
                ", strWeight='" + strWeight + '\'' +
                '}';
    }
}
