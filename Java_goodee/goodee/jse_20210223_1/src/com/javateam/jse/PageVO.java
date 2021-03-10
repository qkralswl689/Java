package com.javateam.jse;

public class PageVO {
	
	private int page;
	private int totalPage;
    private int limit;
	
    @Override
	public String toString() {
		return "page=" + page + ", totalPage=" + totalPage + ", limit=" + limit + "]";
	}    

    public static void main(String[] args) {
    	
    	PageVO p = new PageVO();
    	p.page = 1;
    	p.totalPage =2;
    	p.limit = 4;
    	
    	System.out.println(p.toString());
	}

}
