/*
 *  Copyright 2009-2016 Weibo, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.weibo.motan.demo.client;

import com.weibo.api.motan.config.RefererConfig;
import com.jcgroup.BookService;

public class MotanApiClientDemo extends BasicService{


    public void call(){
        // 使用服务
        RefererConfig<BookService> config = new RefererConfig<BookService>();
        config.setInterface(BookService.class);
        RefererConfig<BookService> refererConfig  = getEnv(config);
        BookService bookService = refererConfig.getRef();
        System.out.println(bookService.getAllBookNames());
    }

    public static void main(String[]args){
        MotanApiClientDemo demo = new MotanApiClientDemo();
        demo.call();
    }
}
