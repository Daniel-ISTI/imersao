public class Movimento {
    private LocalDateTime dataMovimento;


    public Movimento(LocalDateTime dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    public LocalDateTime getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(LocalDateTime dataMovimento) {
        this.dataMovimento = dataMovimento;
    }
}
