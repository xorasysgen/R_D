package code.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSixOracleHelp {


	public static void main(String[] args) {
		 List<Customer> list=new Customer().getAllCustomer();
		 list.sort((a,b)-> {if(a.getBalance()<b.getBalance()) return 1; else return -1;});
		 List<Customer> newList=list.stream().filter(x->x.getCustomerName().startsWith("S") || x.getCustomerName().endsWith("r")).collect(Collectors.toList());
		 System.out.println(list.stream().allMatch(a->a.getBalance()>250000));
		 System.out.println(newList);
		 @SuppressWarnings("unused")
		Stream<String> streamBuilder =Stream.<String>builder().add("a").add("b").add("c").build();//stream builder
		 System.out.println("__________________________________________");
		 list.forEach(e->System.out.println(e));
		List<Integer> i=Arrays.asList(1,2,3,4,5,6,7,8,6,5,4,3,2,1,-4,-6,-7,-3,0);
		
		
		i.forEach(x->System.out.print(x));
		
		System.out.println("");
		System.out.println(i.stream()
				.sorted(Comparator.reverseOrder())
				.distinct()
				.filter(x->x>-5)
				.limit(10)
				.skip(2)
				.collect(Collectors.toList()));
		
		
		int product = i.stream().reduce(10, (a, b) -> a * b);
		System.out.println(product);
		 product = i.stream().reduce(1, Integer::max);
		 System.out.println(product);
		 IntStream oddNumbers = 
				    IntStream.rangeClosed(15, 35)
				             .filter(n -> n % 2 == 0);
		 System.out.println(oddNumbers);
		 Stream<Integer> numbers = Stream.iterate(0, n -> n + 10).limit(10);//generate 0 to 9 total 10 digits
		 System.out.println(numbers.collect(Collectors.toList()));
		 System.out.println(list.stream().filter(x->x.getCustomerName().length()==0).count());//count which length is equals to 0
		 System.out.println(list.parallelStream().distinct().count());//count distinct object
		 System.out.println(list.parallelStream().anyMatch(x->x.getCustomerName().equals("")));//find if elements contains
		 //Grouping of stream’s elements according to the specified function:
		 Map<Integer,List<Customer>> map=list.stream().collect(Collectors.groupingBy(Customer::getCustomerId));//grouping by customer Id
		 System.out.println(map);
		 //Dividing stream’s elements into groups according to some predicate:
		 Map<Boolean,List<Customer>> newMap=list.stream().collect(Collectors.partitioningBy(p->p.getBalance()>1500000));
		 System.out.println(newMap);
		 List<String> l = Arrays.asList("A", "B", "C", "D");
		Optional<String> result=l.parallelStream().findFirst();
		System.out.println(result);
		 System.out.println(l.stream().findAny());
		 //case convertor
		 l.replaceAll(String::toLowerCase);
		 System.out.println(l);
		 l.replaceAll(r->r.toUpperCase());
		 System.out.println(l);
		 System.out.println(list.stream().map(name->name.getCustomerName().substring(0, 1).toUpperCase().concat(name.getCustomerName().substring(1))).collect(Collectors.toList()));
		 List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);
		 int sum = values.stream()
		   .reduce(1, (i1, i2) -> i1 - i2);
		 System.out.println("reduce TO sum" + sum);// start from 1 to do job
		 Thread thread = new Thread(() -> System.out.println("Hello From Another Thread"));
		 thread.start();
		 Map<Object,List<Customer>> map1=list.stream().collect(Collectors.groupingBy(x->x.getContact()));//grouping by customer Id
		 System.out.println(map1);
		 Map<String,Map<String,List<Customer>>> a=list.stream()
		 .collect(Collectors.groupingBy(Customer::getContact,Collectors.groupingBy(Customer::getGender)));
		 System.out.println(a);
		 
		Map<Integer, Optional<Customer>> nList= list.stream()
		 .collect(Collectors.groupingBy(Customer::getCustomerId,Collectors.maxBy(Comparator.comparingDouble(Customer::getBalance))));
		System.out.println(nList);
	}
}


