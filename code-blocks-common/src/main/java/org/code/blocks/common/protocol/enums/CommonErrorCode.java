package org.code.blocks.common.protocol.enums;

/**
 * Define Error Code and the corresponding Error Message.
 *
 * @author darwindu
 */
public enum CommonErrorCode implements ErrorCode {

    /**
     * The success.
     */
    SUCCESS(0, "success"),

    /**
     * other uncatched exceptions or error.
     */
    UNKNOW_ERROR(160101, "unknow error, please check the error log."),

    /**
     * illegal input.
     */
    ILLEAGAL_INPUT(160102, "illegal input"),

    /**
     * contract execute exception.
     */
    CONTRACT_EXECUTE_EXCEPTION(160103, "contract execute exception"),

    /**
     * contract execute exception.
     */
    CONTRACT_EXECUTE_TIMEOUT(160104, "contract execute timeout"),

    /**
     * contract return null.
     */
    CONTRACT_RETURN_NULL(160105, "contract return null"),

    /**
     * contract return error.
     */
    CONTRACT_RETURN_ERRORCODE(160106, "contract return error"),

    /**
     * contract return log list is null.
     */
    CONTRACT_RETURN_LOG_LIST_NULL(160107, "contract return log list is null"),

    /**
     * contract return list is null.
     */
    CONTRACT_RETURN_LIST_NULL(160108, "contract return list is null"),

    /**
     * config file:[transaction.limit] must be more then zero
     */
    TRANSACTION_LIMIT(160109, "config file:[transaction.limit] must be more then zero"),
    /**
     * out of ranges error
     */
    OUT_OF_RANGES_ERROR(160110, "out of ranges error"),
    /**
     * field not empty
     */
    FIELD_NOT_EMPTY(160111, "field not empty"),
    ;

    /**
     * error code.
     */
    private int code;

    /**
     * error message.
     */
    private String codeDesc;

    /**
     * Error Code Constructor.
     *
     * @param code The CommonErrorCode
     * @param codeDesc The CommonErrorCode Description
     */
    CommonErrorCode(int code, String codeDesc) {
        this.code = code;
        this.codeDesc = codeDesc;
    }

    /**
     * Get the Error Code.
     *
     * @return the CommonErrorCode
     */
    public int getCode() {
        return code;
    }

    /**
     * Set the Error Code.
     *
     * @param code the new CommonErrorCode
     */
    protected void setCode(int code) {
        this.code = code;
    }

    /**
     * Gets the CommonErrorCode Description.
     *
     * @return the CommonErrorCode Description
     */
    public String getCodeDesc() {
        return codeDesc;
    }

    /**
     * Sets the CommonErrorCode Description.
     *
     * @param codeDesc the new CommonErrorCode Description
     */
    protected void setCodeDesc(String codeDesc) {
        this.codeDesc = codeDesc;
    }
}
