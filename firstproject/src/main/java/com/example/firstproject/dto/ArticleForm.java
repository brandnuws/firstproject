package com.example.firstproject.dto;



import com.example.firstproject.entity.Article;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ArticleForm {
		private String MEMB_ID;


		private String CHARGE_ST_DATE;

		private String CHARGE_END_DATE;

		private String MEMB_CARD_NO;
		
		
		private String chargeStYmd;
		
		private String CHARGE_END_YMD;
		
		
		/*===> @AllArgsConstructor
		 * public ArticleForm(String title, String content) { this.title = title;
		 * this.content = content; }
		 * 
		 * 
		 * ===>@ToString
		 * @Override public String toString() { return "ArticleForm{" + "title='" +
		 * title + '\'' + ", content='" + content + '\'' + '}'; }
		 */

		
		/*
		 * public Article toEntity() { return new Article(null, title, content); }
		 */
}
