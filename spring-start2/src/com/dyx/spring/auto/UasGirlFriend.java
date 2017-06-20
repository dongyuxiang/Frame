package com.dyx.spring.auto;

import org.springframework.stereotype.Component;

/**
 * Component 代表一种组件
 * @autor win
 */
//@Service("usaGirlFriend")
//@Controller("usaGirlFriend")
//@Repository("usaGirlFriend")
@Component("usaGirlFriend")
public class UasGirlFriend {
	public String speak(){
		return "english";
	}
}
