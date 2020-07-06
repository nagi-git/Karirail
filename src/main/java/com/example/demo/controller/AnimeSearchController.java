package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.filteridsDto.FilteridsDto;
import com.example.demo.service.FilteridsService;

@Controller
public class AnimeSearchController {

	@Autowired
	FilteridsService fsService;

	/**
	 * GET用の処理.
	 */
	@RequestMapping("/filterids")
	public String filteridsForm(HttpSession session, Model model) {
		// filterids.htmlに画面遷移
		return "filterids";
	}

	/**
	 * 図書館一覧表示
	 * 
	 * @return "filterids-confirm"
	 */
	@RequestMapping(value = "/filterids/confirm", method = RequestMethod.POST)
	public String filteridsConfirm(HttpSession session, Model model, @RequestParam("filter_ids") String filter_ids) {

		System.out.println("filteridsConfirm呼び出し成功");

		// 一応必須チェックのみ 数字・桁数チェックは省略
		// nullまたは空文字の場合、入力フォームにエラーメッセージを表示
		if (filter_ids == null || filter_ids.equals("")) {
			model.addAttribute("errorMessage", "都道府県名を入力してください。");
			return filteridsForm(session, model);
		}

		// 図書館検索APIサービス呼び出し
		FilteridsDto filteridsDto = fsService.service(filter_ids);

		System.out.println("fsService.service呼び出し成功");

		// thymeleafでリストを展開して表示する
		model.addAttribute("filteridsList", filteridsDto.getWorks());

		System.out.println("model.addAttribute呼び出し成功");

		return "filterids-confirm";
	}
}
