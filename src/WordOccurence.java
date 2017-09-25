class WordOccurence implements Comparable{

    String word;
    int count;

    public WordOccurence(String word, int count){

        this.word = word;
        this.count= count;
    }

    @Override
    public int compareTo(Object obj) {
        return count - ((WordOccurence)obj).count;
    }

    @Override
    public boolean equals(Object obj) {
        return word.equals(((WordOccurence)obj).word);
    }

    public String toString(){
        return word + " " + count;
    }
}
