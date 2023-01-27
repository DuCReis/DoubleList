public class main
{
    public static void main (String[] args)
    {
        DoubleList3P teste1 = new DoubleList3P();

        teste1.insertHead(2);
        teste1.insertTail(1);
        teste1.insertHead(4);
        teste1.insertHead(40);
        teste1.insertHead(411);
        teste1.insertHead(233);
        teste1.insertTail(0);
        teste1.insertTail(12);
        teste1.insertTail(2);
        teste1.remove(2);

        teste1.imprimir();

    }

}
