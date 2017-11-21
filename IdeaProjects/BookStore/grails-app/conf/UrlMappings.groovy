class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/book/index")
        "500"(view:'/error')
        "/create"(controller: "book",action: "create",method: "POST")
        "/listbook"(controller: "book", action: "listBook")
	}
}
