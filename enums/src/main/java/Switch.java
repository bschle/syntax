public class Switch {
    private State state = State.OFF;

    public void push() {
        switch (state) {
            case ON:
                this.state = state.OFF;
                break;
            case OFF:
                this.state = state.ON;
                break;
            default:
                new IllegalAccessException("ERROR");
        }
    }
}
