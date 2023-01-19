interface Ipair <T, U>{
	public T getFirst();
	public U getSecond();
}

class pair<T,U> implements Ipair<T,U>{
	private final T first;
	private final U second;

	public pair(T first, U second){
		this.first = first;
		this.second = second;
	}

	
}