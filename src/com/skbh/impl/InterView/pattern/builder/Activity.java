package com.skbh.impl.InterView.pattern.builder;

public class Activity {

	@Override
	public String toString() {
		return "Activity [id=" + id + ", open=" + open + ", close=" + close + ", live=" + live + "]";
	}

	private  Long id;
	private  String open;
	private  String close;
	private  String live;	
	
	private Activity(Long id, String open, String close, String live) {
		this.id = id;
		this.open = open;
		this.close = close;
		this.live = live;
	}

	public static class ActivityBuilder{
		private  Long id=null;
		private  String open=null;
		private  String close=null;
		private  String live=null;
		
		public ActivityBuilder makeId(Long id) {
			this.id = id;
			return this;
		}
		public ActivityBuilder doOpen(String open) {
			this.open = open;
			return this;
		}
		public ActivityBuilder needClose(String close) {
			this.close = close;
			return this;
		}
		public ActivityBuilder goLive(String live) {
			this.live = live;
			return this;
		}
		
		public Activity build() {
			return new Activity(id, open, close, live);
			
		}
	}

	public Long getId() {
		return id;
	}

	public String getOpen() {
		return open;
	}

	public String getClose() {
		return close;
	}

	public String getLive() {
		return live;
	}
	
	
	
	
	
}
