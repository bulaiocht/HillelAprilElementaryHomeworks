package arrays.block.three;

/**
 * This enum consists available contact's groups
 * Created by Kocherga Vitalii
 */
enum Group {
    FAMILY("Family"),
    FRIENDS("Friends"),
    COWORKERS("Coworkers"),
    OTHER("Other");
    private String groupName;

    Group(String name) {
        this.groupName = name;
    }


    @Override
    public String toString() {
        return groupName;
    }
}