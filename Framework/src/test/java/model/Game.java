package model;

public class Game {
    private String gameUrl;
    private int count;

    public Game(String gameUrl, int count) {
        this.gametUrl = gameUrl;
        this.count = count;
    }

    public Game(String gameUrl) {
        this.gameUrl = gameUrl;
    }

    public String getGameUrl() {
        return gameUrl;
    }

    public void setProductUrl(String GameUrl) {
        this.gameUrl = gameUrl;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
