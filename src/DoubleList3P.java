public class DoubleList3P
{
    public DoubleListNode3P head, tail;
    public int nelements;

    DoubleList3P()
    {
        this.head = null;
        this.tail = null;
        this.nelements = 0;
    }

    public void insertHead(int numero)
    {
        DoubleListNode3P newElement = new DoubleListNode3P();

        if(this.head == null)
        {
            newElement.element = numero;
            this.head = newElement;
            this.tail = newElement;
            this.nelements++;
        }else {
            newElement.element = numero;
            this.head.previous = newElement;
            newElement.next = this.head;
            this.head = newElement;
            this.nelements++;
        }
    }

    public void insertTail(int numero)
    {
        DoubleListNode3P newElement = new DoubleListNode3P();
        if(this.tail == null)
        {
            newElement.element = numero;
            this.head = newElement;
            this.tail = newElement;

        }else{
            newElement.element = numero;
            this.tail.next = newElement;
            newElement.previous = this.tail;
            this.tail = newElement;
        }
        this.nelements++;
    }

    public void removeAtHead()
    {
        if(this.head != null)
        {
            if(nelements > 1)
            {
                this.head = this.head.next;
                this.head.previous = null;
            }else{
                this.head = null;
                this.tail = null;
            }
            nelements--;
        }
    }

    public void removeAtTail()
    {
        if(this.tail != null)
        {
            if(nelements > 1)
            {
                this.tail = this.tail.previous;
                this.tail.next = null;
            }else{
                this.head = null;
                this.tail = null;
            }
            nelements--;
        }
    }

    public Integer peekAtHead()
    {
        if(this.head != null)
        {
            return this.head.element;
        }
        return null;
    }

    public Integer peekAtTail()
    {
        if(this.tail != null)
        {
            return this.tail.element;
        }
        return null;
    }

    public int size()
    {
        return nelements;
    }

    public void imprimir()
    {
        if(this.head != null)
        {
            DoubleListNode3P current = this.head;
            for(int i = 1; i <= nelements; i++)
            {
                System.out.println( i + " elemento = " + current.element);
                current = current.next;
            }
        }else{
            System.out.println("não existe nada!");
        }
    }

    public boolean remove(int numero)
    {
        if(this.head == null)
            return false;

        DoubleListNode3P current = this.head;

        while (current != null && current.element != numero)
            current = current.next;

        if(current == this.head)
        {
            current.next.previous = null;
            this.head = current.next;
            nelements--;
            return true;
        }
        if(current == this.tail)
        {
            current.previous.next = null;
            this.tail = current.previous;
            nelements--;
            return true;
        }
        if(current == null)
        {
            return false;
        }else{
            current.previous.next = current.next;
            current.next.previous = current.previous;
            nelements--;
            return true;
        }
    }
}
