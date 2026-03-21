using UnityEngine;
using UnityEngine.InputSystem;

public class Player : MonoBehaviour
{
   public Rigidbody2D rb;
    public PlayerInput playerInput;
    public float speed;

    public Vector2 moveInput;


    void FixedUpdate()
    {
        float targetSpeed = moveInput.x * speed;
        rb.linearVelocity = new Vector2 (targetSpeed, rb.linearVelocity.y);
    }


    public void OnMove(InputValue value)
    {
        moveInput = value.Get<Vector2>();
    }
}