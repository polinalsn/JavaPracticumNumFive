class horse extends Thread {
    public void run(final int msq) {
        synchronized (this) {
            System.out.println("Финишировала лошадь под номером - " + msq);
        }
    }
}

class horse_run {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            horse thread = new horse();
            thread.run(i);
        }
    }
}
