public class merge{
    public static void m(int a[],int l,int h)
    {
      if(l<h)
      {
        int mid=(l+h)/2;
        m(a, l, mid);
        m(a,mid+1,h);
        merge(a, l, mid, h);
      }
        
    }
    public static void merge(int a[],int l,int mid,int h)
    {
      int i=l;
      int j=mid+1;
      int k=0;
      int temp[]=new int[h-l+1];

      while(i<=mid && j<=h)
      {
        if(a[i]<=a[j])
        {
          temp[k++]=a[i++];
        }
        else{
          temp[k++]=a[j++];
        }
      }
      while(i<=mid)
      {
        temp[k++]=a[i++];
      }

      while(j<=h)
      {
        temp[k++]=a[j++];
      }

      for(int x=0;x<temp.length;x++)
      {
        a[l+x]=temp[x];

      }


    }
    public static void main(String args[])
  {
    int a[]={10,7,8,9,1,5};
    m(a, 0, a.length-1);
    for(int m:a)
    {
        System.out.print(m+" ");
    }


  }
}