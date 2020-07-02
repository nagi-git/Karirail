package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.libraryInfoDto.LibraryInfoDto;
import com.example.demo.service.PlaceCodeService;

@Controller
public class LibrarySearchController {

	@Autowired
	PlaceCodeService pcService;

	/**
	 * GET用の処理.
	 */
	@RequestMapping("/placecode")
	public String placecodeForm(HttpSession session, Model model) {
		// placecode.htmlに画面遷移
		return "placecode";
	}

	/**
	 * 図書館一覧表示
	 * 
	 * @return "placecode-confirm"
	 */
	@RequestMapping(value = "/placecode/confirm", method = RequestMethod.POST, consumes = { "text/xml;charset=utf-8",
			"application/x-www-form-urlencoded" })
	public String placecodeConfirm(HttpSession session, Model model, @RequestParam("formal") String formal) {

		// 一応必須チェックのみ 数字・桁数チェックは省略
		// nullまたは空文字の場合、入力フォームにエラーメッセージを表示
		if (formal == null || formal.equals("")) {
			model.addAttribute("errorMessage", "都道府県名を入力してください。");
			return placecodeForm(session, model);
		}

		// 図書館検索APIサービス呼び出し
		LibraryInfoDto libraryInfoDto = pcService.service(formal);

		System.out.println("pcService.service呼び出し成功");

		// thymeleafでリストを展開して表示する
		model.addAttribute("placecodeList", libraryInfoDto.getLibraryInfo());

		System.out.println("model.addAttribute呼び出し成功");

		return "placecode-confirm";
	}
}
