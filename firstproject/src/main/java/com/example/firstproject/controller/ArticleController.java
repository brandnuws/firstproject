package com.example.firstproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.firstproject.repository.FindAllRepository;
import com.example.firstproject.repository.ManagedFreeRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor // final 필드값을 알아서 가져옴
@Controller
public class ArticleController {
	@Autowired // 스프링부트가 미리 생성해놓은 객체를 가져다가 자동 연결!
	// 리파지터리 객체 자동 삽입됨! RequiredArgsConstructor
	private final FindAllRepository findAllRepository;
	private final ManagedFreeRepository managedFreeRepository;

	/*
	 * @GetMapping("/home") public String index(Model model, Pageable pageable) { //
	 * 모든 Article을 가져옴 // Iterable 인터페이스는 ArrayList의 부모 인터페이스
	 * 
	 * // 뷰 페이지로 articles 전달! String stYmd = "20211001"; String endYmd = "20211031";
	 * //
	 * model.addAttribute("articles",findAllRepository.findAllByChargeStYmdBeteen(
	 * stYmd, endYmd) );
	 * model.addAttribute("articles",managedFreeRepository.findAll() );
	 * //model.addAttribute("articles",findAllRepository.findById(stYmd) ); // 뷰 페이지
	 * 설정 return "content/home";
	 * 
	 * @GetMapping("/articles") public String index(Model model) { // 모든 Article을
	 * 가져옴 // Iterable 인터페이스는 ArrayList의 부모 인터페이스 Iterable<Article> articleList =
	 * articleRepository.findAll(); // 뷰 페이지로 articles 전달!
	 * model.addAttribute("articles", articleList); // 뷰 페이지 설정 return
	 * "articles/index";
	 * 
	 * }
	 */

	@GetMapping("/articles/new")
	public String newArticleForm() {
		return "/articles/new";
	}

	/*
	 * @PostMapping("/articles/create") public String createArticle(ArticleForm
	 * form) { //System.out.println(form.toString()); --> 로깅으로 대체
	 * log.info(form.toString()); // dto를 entity로
	 * 
	 * Article article = form.toEntity(); //System.out.println(article.toString());
	 * log.info(article.toString());
	 * 
	 * // repo 로 entity룰 db안에 저장 Article saved = articleRepository.save(article);
	 * //System.out.println(saved.toString()); log.info(saved.toString()); return
	 * ""; }
	 */

	/*
	 * @PostMapping("/articles/create") public String createArticle(ArticleForm
	 * form) { //System.out.println(form.toString()); --> 로깅으로 대체
	 * log.info(form.toString()); // dto를 entity로
	 * 
	 * Article article = form.toEntity(); //System.out.println(article.toString());
	 * log.info(article.toString());
	 * 
	 * // repo 로 entity룰 db안에 저장 Article saved = articleRepository.save(article);
	 * //System.out.println(saved.toString()); log.info(saved.toString()); return
	 * ""; }
	 */

}
