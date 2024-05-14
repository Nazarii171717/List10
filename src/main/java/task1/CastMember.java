package task1;
public class CastMember {
    private String actorName;
    private String characterName;

    public CastMember(String actorName, String characterName) {
        this.actorName = actorName;
        this.characterName = characterName;
    }

    @Override
    public String toString() {
        return "CastMember{" +
                "actorName='" + actorName + '\'' +
                ", characterName='" + characterName + '\'' +
                '}';
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
}
