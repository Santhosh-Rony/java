class outside {
    String name0 = "santhosh";

    class inside{
        String name1 = "rony";
    }
}


class outin{
    public static void main(String[] args) {
        outside outer = new outside();
        outside.inside inner = outer.new inside();
        outer.name0 = "thalapathy";
        System.out.println(outer.name0 + " " + inner.name1);
    }
}