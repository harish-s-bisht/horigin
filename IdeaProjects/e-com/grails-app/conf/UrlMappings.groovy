class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        "/"(view:"/user/register")
        "500"(view:'/error')
       /* "/" (controller:"userController", action:"index")
        "500"(view:'/error')*/


        "/register"(controller:"user", action:"register", method:"POST")
        "500"(view:'/error')
        "404"(view:'/not-found')

        "/getByIds"(controller: "user", action: "getByIds" ,method:"GET")
        "404"(view:"/not-found")
	}
}
