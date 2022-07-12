public class RegisterAdventurer implements Action{
    private Player player;

    public RegisterAdventurer(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.registerAdventurer();
    }

    @Override
    public void cancel() {
        player.unregisterAdventurer();
    }
}
