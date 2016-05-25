package de.toporaz

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class PersonControllerController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond PersonController.list(params), model:[personControllerCount: PersonController.count()]
    }

    def show(PersonController personController) {
        respond personController
    }

    def create() {
        respond new PersonController(params)
    }

    @Transactional
    def save(PersonController personController) {
        if (personController == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (personController.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond personController.errors, view:'create'
            return
        }

        personController.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'personController.label', default: 'PersonController'), personController.id])
                redirect personController
            }
            '*' { respond personController, [status: CREATED] }
        }
    }

    def edit(PersonController personController) {
        respond personController
    }

    @Transactional
    def update(PersonController personController) {
        if (personController == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (personController.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond personController.errors, view:'edit'
            return
        }

        personController.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'personController.label', default: 'PersonController'), personController.id])
                redirect personController
            }
            '*'{ respond personController, [status: OK] }
        }
    }

    @Transactional
    def delete(PersonController personController) {

        if (personController == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        personController.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'personController.label', default: 'PersonController'), personController.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'personController.label', default: 'PersonController'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
