public class nodetugas {
    String question;
    String answer;
    nodetugas next;
    nodetugas prev;
    public nodetugas(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.next = null;
        this.prev = null;
    }
}
