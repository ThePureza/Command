public class UnregisterAdventurer implements Action{
    private Player player;

    public UnregisterAdventurer(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.unregisterAdventurer();
    }

    @Override
    public void cancel() {
        player.registerAdventurer();
    }
}
